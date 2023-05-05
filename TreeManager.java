import java.util.List;

public class TreeManager {
    private final String ROOT_NODE_NM = "ROOT";
    private List<TreeNode> treeList;
    private int depth=0;

    public TreeManager(List<TreeNode> treeList){
        this.treeList = treeList;
    }

    public TreeNode getNode(String code){
        for (TreeNode treeNode : treeList) {
            if(code.equals(treeNode.getCode())){
                return treeNode;
            }
        }
        //최상위노드를 더미로 리턴해준다
        return new TreeNode("ROOT",ROOT_NODE_NM,"","1");
    }
    public int getNodeCnt(){
        return this.treeList.size();
    }
    public String getRootNodeNm(){
        return this.ROOT_NODE_NM;
    }

    public void printNode(TreeNode treeNode){
        System.out.println(getSpace(treeNode.getDepth())+"ㄴ"+treeNode.getCode()+"//"+treeNode.getName());
        if(treeNode.getChildList() != null){
            for (TreeNode treeNodeSub : treeNode.getChildList()) {
                treeNodeSub.setDepth(treeNode.getDepth()+1);
                printNode(treeNodeSub);
            }
        }
    }
    public String getSpace(int cnt){
        String space="";
        for(int i=0 ;i<cnt;i++){
            space=space+"  ";
        }
        return space;
    }

}
