package Box_game;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match (Fighter f1,Fighter f2 , int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }

    public void run(){
        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){

               if (firtHit()){
                   System.out.println("--------Yeni Rount ---------");
                   System.out.println("A nın canı " + f1.health);
                   System.out.println("B nın canı " + f2.health);

                   this.f2.health = this.f1.hit(this.f2);

                   if (isWin()){
                       break;
                   }

                   this.f1.health =this.f2.hit(this.f1);
                   if (isWin()){
                       break;
                   }
               } else if (!firtHit()) {
                   System.out.println("--------Yeni Rount ---------");
                   System.out.println("A nın canı " + f1.health);
                   System.out.println("B nın canı " + f2.health);

                   this.f2.health = this.f1.hit(this.f2);

                   if (isWin()){
                       break;
                   }

                   this.f1.health =this.f2.hit(this.f1);
                   if (isWin()){
                       break;
                   }


               }

            }

        }

        }

    boolean firtHit(){
        double random = Math.random() *100;
        return random < 50 ;
    }

    boolean isCheck(){
        return (this.f1.weight>this.minWeight && this.f1.weight < this.maxWeight) && (this.f2.weight>this.minWeight && this.f2.weight < this.maxWeight);
    }
    boolean isWin(){
        if (this.f1.health <= 0){
            System.out.println("winner f2");
        } else if (this.f2.health <= 0) {
            System.out.println("winner f1");

        }
        return false;
    }


}





