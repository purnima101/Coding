package JavaDSA.Tree;
import java.util.*;
public class ArrayNode {
    String data;
    ArrayList<ArrayNode>  children;

    public ArrayNode(String data)
    {
        this.data = data;
        this.children = new ArrayList<ArrayNode>();
    }

    public void addNode(ArrayNode child){
        this.children.add(child);
    }

    public String print(int level){
        String ret;
        ret=" ".repeat(level)+data+"\n";
        for(ArrayNode node: this.children){
            ret += node.print(level+1);

        }
        return ret;
    }

}
