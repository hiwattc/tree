import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeTest{
    public static void main(String[] args) {
        //테이블설계
        /*
        ORG_CD, ORG_NM, UP_ORG_CD, SEQ
        A01, A공일, ROOT, 1
        A02, A공이, A01, 1
        */

        //1. 테스트데이터 만들기
        List<Org> orgList = new ArrayList<Org>();
        orgList.add(new Org("01","스타루트","ROOT","1"));
        orgList.add(new Org("02","본부1","01","1"));
        orgList.add(new Org("03","본부2","01","2"));
        orgList.add(new Org("04","사업부1","03","1"));
        orgList.add(new Org("05","사업부2","03","2"));
        orgList.add(new Org("06","사업실1","05","1"));
        orgList.add(new Org("07","사업실2","05","2"));
        orgList.add(new Org("08","팀1","07","1"));
        orgList.add(new Org("09","팀2","07","2"));
        orgList.add(new Org("10","팀3","06","1"));
        orgList.add(new Org("11","팀4","06","2"));

        for (Org orgData : orgList) {
            System.out.println("orgList : "+orgData.toString());
            //System.out.println(orgData.getOrgCd());
        }
        //2. 테스트데이터 트리형태로 변환하기
        List<TreeNode> treeList = new ArrayList<TreeNode>();
        //2-1. orgList 데이터를 treeList로 복사
        for (Org orgData : orgList) {
            TreeNode tn = new TreeNode(orgData);
            treeList.add(tn);
        }
        //2-2. treeList복사결과 확인
        for (TreeNode treeNode : treeList) {
            System.out.println("treeList : "+treeNode);
        }
        //2-3. treeList childList생성 : 전체노드에 대해서 순서대로 상위노드내 차일드리스트에 추가
        TreeManager treeMng = new TreeManager(treeList);
        TreeNode parentNode;
        for (TreeNode currNode : treeList) {
            parentNode = treeMng.getNode(currNode.getParentCode());
            System.out.println("현재노드:"+currNode.toString()+" --- "+"상위노드:"+parentNode.toString());
            parentNode.addChild(currNode);
        }
        

        //3-1. 최종 결과확인
        TreeNode node1 = treeMng.getNode("01");
        System.out.println("전체노드개수:"+treeMng.getNodeCnt());
        System.out.println(node1.getCode()+":"+node1.toString());
        System.out.println(node1.getCode()+" child count:"+node1.getChildList().size());
        System.out.println("========================================");
        treeMng.printNode(node1);

    }
}