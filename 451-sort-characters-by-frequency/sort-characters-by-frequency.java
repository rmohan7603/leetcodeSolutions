class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hmap=new HashMap<>();
        for(char c:s.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        Map<Integer,List<Character>> fmap=new HashMap<>();
        for(char i:hmap.keySet()){
            if(!fmap.containsKey(hmap.get(i)))
            fmap.put(hmap.get(i),new ArrayList<>());
            fmap.get(hmap.get(i)).add(i);
        }
        String y="";
        for(int i=s.length();i>0;i--){
            if(fmap.containsKey(i)){
                for(char c:fmap.get(i)){
                    for(int j=0;j<i;j++)
                    y+=c;
                }
            }
        }
        return y;
    }
}