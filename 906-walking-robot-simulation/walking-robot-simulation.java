class Solution {
    Set<String> obstacle=new HashSet<>();
    public int addSimu(int a,int b,int c,int di){
        for(int i=0;i<c;i++){
            b+=1;
            if((obstacle.contains(a+","+b) && di==0) || (obstacle.contains(b+","+a) && di==1))
            return b-1;
        }
        return b;
    }
    public int subSimu(int a,int b,int c,int di){
        for(int i=0;i<c;i++){
            b-=1;
            if((obstacle.contains(a+","+b) && di==2) || (obstacle.contains(b+","+a) && di==3))
            return b+1;
        }
        return b;
    }
    public int robotSim(int[] commands, int[][] obstacles) {
        int maxDist=0;
        for(int[] i:obstacles)
        obstacle.add(i[0]+","+i[1]);
        System.out.println(obstacle);
        int x=0,y=0,d=0;
        for(int i:commands){
            if(i==-1)
            d+=1;
            else if(i==-2){
                d-=1;
                while(d<0)
                d+=4;
            }
            else{
                int dir=d%4;
                if(dir==0)
                y=addSimu(x,y,i,dir);
                else if(dir==1)
                x=addSimu(y,x,i,dir);
                else if(dir==2)
                y=subSimu(x,y,i,dir);
                else
                x=subSimu(y,x,i,dir);

            }
            maxDist=Math.max(x*x+y*y,maxDist);
        }
        return maxDist;
    }
}