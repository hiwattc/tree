public class Org {
    private String orgCd;
    private String orgNm;
    private String upOrgCd;
    private String seq;

    public Org(String orgCd, String orgNm, String upOrgCd, String seq){
        this.orgCd = orgCd;
        this.orgNm = orgNm;
        this.upOrgCd = upOrgCd;
        this.seq = seq;

    }

    public void setOrgCd(String orgCd){
        this.orgCd = orgCd;
    }
    public String getOrgCd(){
        return this.orgCd;
    }

    public void setOrgNm(String orgNm){
        this.orgNm = orgNm;
    }
    public String getOrgNm(){
        return this.orgNm;
    }

    public void setUpOrgCd(String upOrgCd){
        this.upOrgCd = upOrgCd;
    }
    public String getUpOrgCd(){
        return this.upOrgCd;
    }

    public void setSeq(String seq){
        this.seq = seq;
    }
    public String getSeq(){
        return this.seq;
    }

    public String toString(){
        return this.orgCd+"/"+this.orgNm+"/"+this.upOrgCd+"/"+this.seq;
    }

    
}
