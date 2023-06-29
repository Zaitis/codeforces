public class PathTogether {
    public int pathTogeters(int xA, int yA, int xB, int yB, int xC, int yC) {
        int pathXB =0, pathXC=0, pathYB=0, pathYC=0;
        if (xB>xA){
            if(xC>xA){
                pathXB=xB-xA;
                pathXC=xC-xA;
   //             System.out.println("1 blok: "+ pathXB + " "+ pathXC);
            }
        } else if(xC<xA){
                pathXB=xA-xB;
                pathXC=xA-xC;
  //          System.out.println("2 blok: "+ pathXB + " "+ pathXC);
            }
        if (yB>yA){
            if(xC>yA){
                pathYB=yB-yA;
                pathYC=yC-yA;
 //               System.out.println("3 blok: "+ pathYB + " "+ pathYC);
            }
        } else if(yC<yA){
            pathYB=yA-yB;
            pathYC=yA-yC;
   //         System.out.println("4 blok: "+ pathYB + " "+ pathYC);
        }


    return (Math.min(pathXB,pathXC)+Math.min(pathYB,pathYC)+1);
    }
}
