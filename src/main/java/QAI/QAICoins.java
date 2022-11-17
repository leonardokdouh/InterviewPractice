package QAI;

public class QAICoins {
    public static void main(String[] args) {
        int [] coins = {1, 2, 5};

        System.out.println(coins(5, coins));



    }


    public static int coins(int moneyAvailable, int[] coins){
        int [] amountArray = new int[moneyAvailable + 1];
        //Inicializo la pos 0 del array
        amountArray[0] = 1;

        //Voy recorriendo las coins
        for (int i = 0; i < coins.length; i++){ // I = posicion de la coin en la que estoy
            //Recorro el amountArray
            int coin = coins[i];
            for (int currentAmount = 0; currentAmount < amountArray.length; currentAmount++){                //currentAmount = posicion del amount actual en el que estoy (tambien es el amount)
                //Pregunto si el amount me alcanza para gastar mi coin
                if (currentAmount >= coin){                                                    // Si entro aca es porque para el amount actual es suficiente para gastar la coin que tengo. Pero puede darse el caso de que yo pueda gastar la coint y me sobre plata
                    amountArray[currentAmount] += amountArray[currentAmount - coin];       // amountArray[currentAmount - coins] --> Aca estoy viendo si me sobra plata si no me sobra plata
                    // Ej(Amount=5 (currentAmount), Coin = 5) => currentAmount - coin = 0;  Sumo amountArray[0] (Es 1 pq asi lo inicialice). Quiere decir que la moneda me alcanza para comprar pero no me sobra nada
                    // es decir, se suma solo una combinacion a las que ya tenia;
                }
            }
        }
        return amountArray[moneyAvailable];
    }
}
