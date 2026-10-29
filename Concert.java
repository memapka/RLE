public class Concert {

    private int freeSeats; 

    public Concert(int totalSeats) {
        this.freeSeats = totalSeats;
    }

    public void bookTicket(int count) {
        if (count <= 0) {
            System.out.println("количество билетов должно быть больше 0.");
            return;
        }
        if (count > freeSeats) {
            System.out.println("недостаточно мест. Свободно: " + freeSeats);
            return;
        }
        
        freeSeats -= count;
        System.out.println("забронировано: " + count + ". Осталось мест: " + freeSeats);
    }

    public void cancelTicket(int count) {
        if (count <= 0) {
            System.out.println("количество билетов должно быть больше 0.");
            return;
        }
        
        freeSeats += count;
        System.out.println("отменено: " + count + ". Теперь свободно: " + freeSeats);
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public static void main(String[] args) {
        Concert concert = new Concert(10); 
        concert.bookTicket(3);    
        concert.bookTicket(8);  
        concert.cancelTicket(2);  
        concert.bookTicket(5);    
    }
}