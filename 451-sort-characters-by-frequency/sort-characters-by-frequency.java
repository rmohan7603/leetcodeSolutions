class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hmap=new HashMap<>();
        for(char c:s.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        List<Character> bkt[]=new ArrayList[s.length()+1];
        for(char i:hmap.keySet()){
            int freq=hmap.get(i);
            if(bkt[freq]==null)
            bkt[freq]=new ArrayList<>();
            bkt[freq].add(i);
        }
        StringBuilder y=new StringBuilder();
        for(int i=s.length();i>0;i--){
            if(bkt[i]!=null){
                for(char c:bkt[i]){
                    for(int j=0;j<i;j++)
                    y.append(c);
                }
            }
        }
        return y.toString();
    }
}