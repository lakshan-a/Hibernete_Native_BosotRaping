package Hibernete.Boostrapping.NativeBoostRaping.embedded;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class MobileNo {

    private String type;
    private String mobileNo;

    public MobileNo() {}

    public MobileNo(String type, String mobileNo) {
        this.type = type;
        this.mobileNo = mobileNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "MobileNo{" +
                "type='" + type + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
