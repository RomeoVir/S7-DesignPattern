package esercizioinsingleton;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inizio programma!" );
        
        Info info = new Info();
        info.setLatitudine("1.234567");
        info.setLongitudine("7.654321");
        info.setLivelloFumo(2);
        
        SondaData userData = new SondaData();
        
        AdapterDati info2 = new AdapterDati();
		info2.setLatitudine(info.getLatitudine());
		info2.setLongitudine(info.getLongitudine());
		info2.setLivelloFumo(info.getLivelloFumo());
		
		userData.getData(info2);
		
		userData.stampa();
        
    }
}
