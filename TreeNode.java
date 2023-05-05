import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private String code;
    private String name;
    private String parentCode;
    private String seq;
    private int depth;
    private List<TreeNode> childList;

    public TreeNode(String code, String name, String parentCode, String seq){
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        this.seq = seq;
        this.childList = new ArrayList<TreeNode>();

    }
    public TreeNode(Org org){
        this.code = org.getOrgCd();
        this.name = org.getOrgNm();
        this.parentCode = org.getUpOrgCd();
        this.seq = org.getSeq();
        this.childList = new ArrayList<TreeNode>();

    }

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setParentCode(String parentCode){
        this.parentCode = parentCode;
    }
    public String getParentCode(){
        return this.parentCode;
    }

    public void setSeq(String seq){
        this.seq = seq;
    }
    public String getSeq(){
        return this.seq;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
    public int getDepth(){
        return this.depth;
    }

    public void addChild(TreeNode child){
        this.childList.add(child);
    }
    public void printChild(){
        for (TreeNode treeNode : childList) {
            System.out.println("CHILD :: "+treeNode);
        }
    }
    public List<TreeNode> getChildList(){
        return this.childList;
    }

    public String toString(){
        return this.code+"/"+this.name+"/"+this.parentCode+"/"+this.seq;
    }

    
}
