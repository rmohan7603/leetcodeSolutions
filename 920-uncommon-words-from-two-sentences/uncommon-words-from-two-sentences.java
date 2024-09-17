class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Arr=s1.split(" ");
        String[] s2Arr=s2.split(" ");
        List<String> ansLst=new ArrayList<>();
        Map<String,Integer> s1Map=new HashMap<>();
        Map<String,Integer> s2Map=new HashMap<>();
        for(String i:s1Arr){
            if(s1Map.containsKey(i))
            s1Map.put(i,s1Map.get(i)+1);
            else
            s1Map.put(i,1);
        }
        for(String i:s2Arr){
            if(s2Map.containsKey(i))
            s2Map.put(i,s2Map.get(i)+1);
            else
            s2Map.put(i,1);
        }
        for(String i:s1Map.keySet()){
            if(s1Map.get(i)==1 && !s2Map.containsKey(i))
            ansLst.add(i);
        }
        for(String i:s2Map.keySet()){
            if(s2Map.get(i)==1 && !s1Map.containsKey(i))
            ansLst.add(i);
        }
        String[] ansArr=new String[ansLst.size()];
        for(int i=0;i<ansLst.size();i++)
        ansArr[i]=ansLst.get(i);
        return ansArr;
    }
}