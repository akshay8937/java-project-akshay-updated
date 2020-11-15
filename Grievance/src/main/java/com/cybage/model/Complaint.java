package com.cybage.model;


import java.util.Date;

public class Complaint {
       private String compId;
       private String citizenId;
       private String citizenName;
       private String deptId;
       private String deptName;
       private String description;
       private String status;
       private String remark;
       private String file;
       private String date;
       
       public Complaint() {
              super();
              // TODO Auto-generated constructor stub
       }
       public Complaint(String compId, String citizenId, String deptId, String description, String status,
                     String remark, String file, String date) {
              super();
              this.compId = compId;
              this.citizenId = citizenId;
              this.deptId = deptId;
              this.description = description;
              this.status = status;
              this.remark = remark;
              this.file = file;
              this.date = date;
       }
       
       
       public Complaint(String compId, String description, String status, String file, String date) {
              super();
              this.compId = compId;
              this.description = description;
              this.status = status;
              this.file = file;
              this.date = date;
       }
       public Complaint(String compId, String citizenName,String deptName, String description, String status, String remark, String date ) {
    	   super();
    	   this.compId=compId;
    	   this.citizenName=citizenName;
    	   this.deptName=deptName;
    	   this.description=description;
    	   this.status=status;
    	   this.remark=remark;
    	   this.date=date;
    	   
       }
       public String getCompId() {
              return compId;
       }
       public void setCompId(String compId) {
              this.compId = compId;
       }
       public String getCitizenId() {
              return citizenId;
       }
       public void setCitizenId(String citizenId) {
              this.citizenId = citizenId;
       }
       public String getDeptId() {
              return deptId;
       }
       public void setDeptId(String deptId) {
              this.deptId = deptId;
       }
       public String getDescription() {
              return description;
       }
       public void setDescription(String description) {
              this.description = description;
       }
       public String getStatus() {
              return status;
       }
       public void setStatus(String status) {
              this.status = status;
       }
       public String getRemark() {
              return remark;
       }
       public void setRemark(String remark) {
              this.remark = remark;
       }
       public String getFile() {
              return file;
       }
       public void setFile(String file) {
              this.file = file;
       }
       public String getDate() {
              return date;
       }
       public void setDate(String date) {
              this.date = date;
       }
       
       public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Complaint [compId=" + compId + ", citizenId=" + citizenId + ", citizenName=" + citizenName + ", deptId="
				+ deptId + ", deptName=" + deptName + ", description=" + description + ", status=" + status
				+ ", remark=" + remark + ", file=" + file + ", date=" + date + "]";
	}
       

}
