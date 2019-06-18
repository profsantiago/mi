package gamesport.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     *
     * @throws Exception por si resulta un error de SQL
     */
    public void Conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tienda?user=root");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/coffechip?user=root");
            

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @throws Exception por si resulta un error de SQL
     */
    public void Desconecar() throws Exception {

        try {
            if (con != null) {
                if (this.con.isClosed() == false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            throw e;

        }
    }
}
