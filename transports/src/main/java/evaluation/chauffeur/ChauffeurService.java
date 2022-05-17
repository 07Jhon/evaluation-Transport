package evaluation.chauffeur;

import evaluation.connectionDB.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChauffeurService{
    private  final Connection connection;

    public ChauffeurService(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<Chauffeur> getChauffeur() throws Exception {
        ArrayList<Chauffeur> listechauffeur = new ArrayList<Chauffeur>();
        java.sql.Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet= null;
        try{
            con = connection.connect();
            preparedStatement = con.prepareStatement("SELECT * FROM chauffeur");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){

                listechauffeur.add(new Chauffeur(resultSet.getInt(1), resultSet.getString(2)));
            }

        } catch (Exception e) {
            throw e;
        }
        finally{
            resultSet.close();
            preparedStatement.close();
            con.close();
        }
        return listechauffeur;
    }
}
