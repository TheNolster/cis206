import java.util.ArrayList;

public class Main {
    static int minVal;
    
    public static int minElevation(ArrayList <Mountain> mountains){
        minVal = mountains.get(0).getHeight();
        for(int i = 0; i < mountains.size(); ++i){
            if(mountains.get(i).getHeight() < minVal){
                minVal = mountains.get(i).getHeight();
            }
        }
        return minVal;
    }
    public static void main(String [] args){
        ArrayList <Mountain> mount = new ArrayList<Mountain>();
        Mountain mountain1;
        Mountain mountain2;
        Mountain mountain3;
        Mountain mountain4;
        Mountain mountain5;
        Mountain mountain6;
        Mountain mountain7;

        //Todo add mountains
        mountain1 = new Mountain();
        mountain1.setName("Chimborazo");
        mountain1.setHeight(20549);
        mountain1.setCountry("Ecuador");
        mount.add(mountain1);
        
        mountain2 = new Mountain();
        mountain2.setName("Matterhorn");
        mountain2.setHeight(14692);
        mountain2.setCountry("Switzerland");
        mount.add(mountain2);

        mountain3 = new Mountain();
        mountain3.setName("Olympus");
        mountain3.setHeight(9573);
        mountain3.setCountry("Greece");
        mount.add(mountain3);

        mountain4 = new Mountain();
        mountain4.setName("Everest");
        mountain4.setHeight(29029);
        mountain4.setCountry("Nepal");
        mount.add(mountain4);
        
        mountain5 = new Mountain();
        mountain5.setName("Mount Marcy - Adirondacks");
        mountain5.setHeight(5344);
        mountain5.setCountry("United States");
        mount.add(mountain5);

        mountain6 = new Mountain();
        mountain6.setName("Mount Mitchell - Blue Ridge");
        mountain6.setHeight(6684);
        mountain6.setCountry("United States");
        mount.add(mountain6);

        mountain7 = new Mountain();
        mountain7.setName("Zugspitze");
        mountain7.setHeight(9719);
        mountain7.setCountry("Switzerland");
        mount.add(mountain7);

        for(int i = 0; i < mount.size(); ++i){
            System.out.println("Mountain: " + mount.get(i).getName()
            + ", Country: " + mount.get(i).getCountry() + ", Elevation: "
            + mount.get(i).getHeight() + " feet/" + mount.get(i).toMeters(mount.get(i).getHeight()) + " meters.\n"); 
        }
        for(int i = 0; i < mount.size(); ++i){
            if(mount.get(i).getHeight() == minElevation(mount)){
            System.out.println("\n" + mount.get(i).getName() 
            + " is the shortest mountain with a height of " 
            + minElevation(mount) + " feet/" + mount.get(i).toMeters(mount.get(i).getHeight()) + " meters.\n");
            }
        }
    }
}