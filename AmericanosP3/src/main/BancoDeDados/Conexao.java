package BancoDeDados;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String URL ="jdbc:postgresql://127.0.0.1:5432/Americanos";
    private static final String USER ="postgres";
    private static final String PASSWORD ="gabi1810";

    public Connection getConexao(){
        Connection conn = null;
        try{
            Class.forName(this.DRIVER);
            conn = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
