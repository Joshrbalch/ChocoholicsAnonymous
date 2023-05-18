
package chocaholicsAnonymous;
/**
* The serviceRecordInfo class builds and holds information that will be sent to ChocAn about the appointment with the provider.
*
* @author Katie Heath
* @version 1.0
*/
public class serviceRecordInfo {
    private Date localDateTime; //date recorded
    private Date localDate; //date appt
    private int providerNum;
    private int memberNum;
    private int serviceCode;
    private String comments;

    serviceRecordInfo() {
        localDateTime = new Date();
        localDate = new Date();
        memberNum = 0;
        providerNum = 0;
        serviceCode = 0;
        comments = "";
    }

    public Date getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(Date date) {
        localDateTime = date;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date date) {
        localDate = date;
    }

    public int getMemberNumber() {
        return memberNum;
    }

    public void setMemberNumber(int num) {
        memberNum = num;
    }

    public int getProviderNumber() {
        return providerNum;
    }

    public void setProviderNumber(int num) {
        providerNum = num;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int num) {
        serviceCode = num;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comm) {
        comments = comm;
    }

}