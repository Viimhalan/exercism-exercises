import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    int code;
    String country;
    Map<Integer, String> dialingCodes;

    public DialingCodes(){
        dialingCodes = new HashMap<Integer, String>();
    }

    public Map<Integer, String> getCodes() {
        return dialingCodes;
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialingCodes.containsKey(code) && !dialingCodes.values().contains(country)){
            dialingCodes.put(code,country);
        }
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }

    public Integer findDialingCode(String country) {
        int code = 0;
        for(int i: dialingCodes.keySet()){
            if(dialingCodes.get(i).equalsIgnoreCase(country)){
                code = i;
            }
        }
        if(code != 0){
            return code;
        }else{
            return null;
        }
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(int i: dialingCodes.keySet()){
            if(dialingCodes.get(i).equalsIgnoreCase(country)){
                dialingCodes.remove(i);
            }
        }
        dialingCodes.put(code, country);
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }
}
