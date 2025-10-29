public class GenProduct <T, U>{
protected T items;
protected U price;
    public void setItems(T item){
        this.items = item;
    }
    public void setPrice(U cost){
        this.price = cost;
    }
    public T getItems(){
        return this.items;
    }
    public U getPrice(){
        return this.price;
    }



}
