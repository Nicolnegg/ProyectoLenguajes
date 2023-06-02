import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.CommonTokenStream;
public class VisitorsComentarios  extends PythonParserBaseVisitor<Void> {
    private int indentLevel = 0;

    @Override
    public Void visitFile_input(PythonParser.File_inputContext ctx) {
        String originalCode = ctx.getStart().getInputStream().toString();

        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            if (child instanceof TerminalNode) {
                TerminalNode terminalNode = (TerminalNode) child;
                Token token = terminalNode.getSymbol();
                if (token.getChannel() == Token.DEFAULT_CHANNEL) {
                    Interval interval = new Interval(token.getStartIndex(), token.getStopIndex());
                    String line = originalCode.substring(interval.a, interval.b + 1);
                    System.out.println("#Nicol " + line);
                }
            }
        }
        return super.visitFile_input(ctx);
    }

    private String getIndentation(int line) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < line; i++) {
            sb.append("\n");
        }
        for (int i = 0; i < indentLevel; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }
}
