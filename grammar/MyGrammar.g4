grammar MyGrammar;

// Lexer rules
NEWLINE: '\r'? '\n';

NAME: [a-zA-Z_][a-zA-Z0-9_]*;
TYPE_COMMENT: '#' ~[\r\n]*;
AWAIT: 'await';
NUMBER: [0-9]+;
STRING: '"' (~["\r\n\\] | '\\' .)* '"';

// Ignorar espacios en blanco
WS: [ \t\r\n]+ -> skip;


single_input: NEWLINE single_input
            | simple_stmt single_input
            | compound_stmt NEWLINE single_input
            ;

file_input: (NEWLINE | stmt)* ENDMARKER;

eval_input: testlist NEWLINE* ENDMARKER;

decorator: '@' dotted_name ( '(' arglist? ')' )? NEWLINE;

decorators: decorator+;

decorated: decorators (classdef | funcdef | async_funcdef);

async_funcdef: ASYNC funcdef;

parameters: '(' typedargslist? ')';
funcdef: 'def' NAME  parameters ('->' test)? ':' TYPE_COMMENT? func_body_suite;



typedargslist: (
  (tfpdef ('=' test)? (',' TYPE_COMMENT? tfpdef ('=' test)?)* ',' TYPE_COMMENT? '/' (',' ( TYPE_COMMENT? tfpdef ('=' test)? (
        ',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? (
        '*' tfpdef? (',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? ('**' tfpdef (',')? TYPE_COMMENT? )?)?)
      | '**' tfpdef (',')? TYPE_COMMENT? )?)?)
  | '*' tfpdef? (',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? ('**' tfpdef (',')? TYPE_COMMENT? )?)?)
  | '**' tfpdef (',')? TYPE_COMMENT? )?)? )
|  (tfpdef ('=' test)? (',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? (
   '*' tfpdef? (',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? ('**' tfpdef (',')? TYPE_COMMENT? )?)?)
  | '**' tfpdef (',')? TYPE_COMMENT? )?)?)
  | '*' tfpdef? (',' TYPE_COMMENT? tfpdef ('=' test)?)* (TYPE_COMMENT | (',' TYPE_COMMENT? ('**' tfpdef (',')? TYPE_COMMENT? )?)?)
  | '**' tfpdef (',')? TYPE_COMMENT? )
);

tfpdef: NAME (':' test)?;

varargslist: vfpdef ('=' test)? (',' vfpdef ('=' test)?)* ',' '/' (',' ( (vfpdef ('=' test)?  (',' vfpdef ('=' test)? )* (',' (
        '*' vfpdef? (',' vfpdef ('=' test)? )* (',' ('**' vfpdef (',')?)?)?
      | '**' vfpdef (',')?)? )?
  | '*' vfpdef? (',' vfpdef ('=' test)? )* (',' ('**' vfpdef (',')?)?)?
  | '**' vfpdef (',')?) )?)? | (vfpdef ('=' test)?  (',' vfpdef ('=' test)? )* (',' (
        '*' vfpdef? (',' vfpdef ('=' test)? )* (',' ('**' vfpdef (',')?)?)?
      | '**' vfpdef (',')?)? )?
  | '*' vfpdef? (',' vfpdef ('=' test)? )* (',' ('**' vfpdef (',')?)?)?
  | '**' vfpdef (',')?
);

vfpdef: NAME;

stmt: simple_stmt | compound_stmt;

simple_stmt: small_stmt (';' small_stmt)* (';')? NEWLINE;

small_stmt: expr_stmt | del_stmt | pass_stmt | flow_stmt | import_stmt | global_stmt | nonlocal_stmt | assert_stmt;
expr_stmt: testlist_star_expr (annassign | augassign (yield_expr | testlist) | (('=' (yield_expr | testlist_star_expr))+ TYPE_COMMENT? )? );
annassign: ':' test ('=' (yield_expr | testlist_star_expr))?;
testlist_star_expr: (test | star_expr) (',' (test | star_expr))* (',')?;
augassign: ('+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '**=' | '//=');
del_stmt: 'del' exprlist;
pass_stmt: 'pass';
flow_stmt: break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt;
break_stmt: 'break';
continue_stmt: 'continue';
return_stmt: 'return' testlist_star_expr?;
yield_stmt: yield_expr;
raise_stmt: 'raise' (test ('from' test)?)?;
import_stmt: import_name | import_from;
import_name: 'import' dotted_as_names;
import_from: 'from' (('.' | '...')* dotted_name | ('.' | '...')+)
              'import' ('*' | '(' import_as_names ')' | import_as_names);
import_as_name: NAME ('as' NAME)?;
dotted_as_name: dotted_name ('as' NAME)?;
import_as_names: import_as_name (',' import_as_name)* (',')?;
dotted_as_names: dotted_as_name (',' dotted_as_name)*;
dotted_name: NAME ('.' NAME)*;
global_stmt: 'global' NAME (',' NAME)*;
nonlocal_stmt: 'nonlocal' NAME (',' NAME)*;
assert_stmt: 'assert' test (',' test)?;

compound_stmt: if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef | decorated | async_stmt;
async_stmt: ASYNC (funcdef | with_stmt | for_stmt);
if_stmt: 'if' namedexpr_test ':' suite ('elif' namedexpr_test ':' suite)* ('else' ':' suite)?;
while_stmt: 'while' namedexpr_test ':' suite ('else' ':' suite)?;
for_stmt: 'for' exprlist 'in' testlist ':' TYPE_COMMENT? suite ('else' ':' suite)?;
try_stmt: 'try' ':' suite ((except_clause ':' suite)+ ('else' ':' suite)? ('finally' ':' suite)? | 'finally' ':' suite);
with_stmt: 'with' with_item (',' with_item)* ':' TYPE_COMMENT? suite;
with_item: test ('as' expr)?;
except_clause: 'except' (test ('as' NAME)? )?;
suite: simple_stmt | NEWLINE INDENT stmt+ DEDENT;

namedexpr_test: test (':=' test)?;
test: or_test ('if' or_test 'else' test)? | lambdef;
test_nocond: or_test | lambdef_nocond;
lambdef: 'lambda' varargslist? ':' test;
lambdef_nocond: 'lambda' varargslist? ':' test_nocond;
or_test: and_test ('or' and_test)*;
and_test: not_test ('and' not_test)*;
not_test: 'not' not_test | comparison;
comparison: expr (comp_op expr)*;





comp_op: '<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' | 'in' | 'not' 'in' | 'is' | 'is' 'not';
star_expr: '*' expr;
expr: xor_expr ('|' xor_expr)*;
xor_expr: and_expr ('^' and_expr)*;
and_expr: shift_expr ('&' shift_expr)*;
shift_expr: arith_expr (('<<' | '>>') arith_expr)*;
arith_expr: term (('+' | '-') term)*;
term: factor (('*' | '@' | '/' | '%' | '//') factor)*;
factor: ('+' | '-' | '~') factor | power;
power: atom_expr ('**' factor)?;
atom_expr: AWAIT? atom trailer*;
atom: ('(' (yield_expr | testlist_comp)? ')' |
       '[' (testlist_comp)? ']' |
       '{' (dictorsetmaker)? '}' |
       NAME | NUMBER | STRING+ | '...' | 'None' | 'True' | 'False');
testlist_comp: (namedexpr_test | star_expr) (comp_for | (',' (namedexpr_test | star_expr))* (',')?);
trailer: '(' arglist? ')' | '[' subscriptlist ']' | '.' NAME;
subscriptlist: subscript (',' subscript)* (',')?;
subscript: test | test? ':' test? sliceop?;
sliceop: ':' test?;
exprlist: (expr | star_expr) (',' (expr | star_expr))* (',')?;
testlist: test (',' test)* (',')?;
dictorsetmaker: (((test ':' test | '**' expr)
                  (comp_for | (',' (test ':' test | '**' expr))* (',')?)) |
                 ((test | star_expr)
                  (comp_for | (',' (test | star_expr))* (',')?)));
classdef: 'class' NAME ('(' arglist? ')')? ':' suite;
arglist: argument (',' argument)* (',')?;

argument: (test (comp_for)? |
           test ':=' test |
           test '=' test |
           '**' test |
           '*' test);

comp_iter: comp_for | comp_if;
sync_comp_for: 'for' exprlist 'in' or_test comp_iter?;
comp_for: ASYNC? sync_comp_for;
comp_if: 'if' test_nocond comp_iter?;

encoding_decl: NAME;

yield_expr: 'yield' yield_arg?;
yield_arg: 'from' test | testlist_star_expr;

func_body_suite: simple_stmt | NEWLINE (TYPE_COMMENT NEWLINE)? INDENT stmt+ DEDENT;

func_type_input: func_type NEWLINE* ENDMARKER;
func_type: '(' typelist? ')' '->' test;
typelist: (test (',' test)* (',' ('*' test? (',' test)* (',' '**' test)? | '**' test)? )? |
           '*' test? (',' test)* (',' '**' test)? | '**' test);



