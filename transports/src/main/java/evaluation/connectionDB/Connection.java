package evaluation.connectionDB;

import evaluation.utils.Environements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.DriverManager;
import java.sql.SQLException;
@Service
public class Connection {

    private final Environements envs;

    @Autowired
    public Connection(Environements envs) {
        this.envs = envs;
    }

    public java.sql.Connection connect() throws Exception {
        String url =  envs.getUrl();
        String user = envs.getUsername();
        String password = envs.getPassword();

        java.sql.Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            throw e;
        }
        return conn;
    }
}
