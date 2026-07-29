class Solution {
    public String decodeString(String s) {
        while (s.contains("[")) {
            
            int closeIdx = s.indexOf(']');
     
            int openIdx = s.lastIndexOf('[', closeIdx);
         
            String inside = s.substring(openIdx + 1, closeIdx);
        
            int numStart = openIdx - 1;
            while (numStart >= 0 && Character.isDigit(s.charAt(numStart))) {
                numStart--;
            }
            numStart++;
            int repeatCount = Integer.parseInt(s.substring(numStart, openIdx));
    
            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < repeatCount; i++) {
                repeated.append(inside);
            }
       
            s = s.substring(0, numStart) + repeated.toString() + s.substring(closeIdx + 1);
        }
        return s;
    }
}