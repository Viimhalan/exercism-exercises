class SqueakyClean {
    static String clean(String identifier) {
        char[] idArr = identifier.toCharArray();
        String mod = "";
        for(int i = 0; i < idArr.length; i++){
            if(idArr[i] == ' '){
                mod += '_';
            }
            else if(idArr[i] == '-'){
                continue;
            }
            else if(i > 0 && idArr[i-1] == '-'){
                mod += Character.toUpperCase(idArr[i]);
            }
            else if(idArr[i] == '4'){
                mod += 'a';
            }
            else if(idArr[i] == '3'){
                mod += 'e';
            }
            else if(idArr[i] == '0'){
                mod += 'o';
            }
            else if(idArr[i] == '1'){
                mod += 'l';
            }
            else if(idArr[i] == '7'){
                mod += 't';
            }
            else if(Character.isLetter(idArr[i]) == false){
                continue;
            }
            else{
                mod += idArr[i];
            }
            
        }
        return mod;
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
