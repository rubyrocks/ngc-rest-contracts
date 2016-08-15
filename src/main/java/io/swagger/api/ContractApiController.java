package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Contract;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-14T19:33:03.884Z")

@Controller
public class ContractApiController implements ContractApi {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public ResponseEntity<Void> deleteContract(@ApiParam(value = "ID of contract to delete",required=true ) @PathVariable("contractId") Long contractId) {
        // delete from contracts table using jdbcTemplate.execute SQL by contractId request value
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Contract> findContractById(@ApiParam(value = "ID of contract to fetch",required=true ) @PathVariable("contractId") Long contractId) {
        // Select from contracts table using jdbcTemplate SQL by contractId request value
    	ResponseEntity<Contract> retContract;
    	Contract ret = null;
        try
        {

        	  /*Contract retContract = (Contract) jdbcTemplate.query(
                    "SELECT * FROM CONTRACTS WHERE contractId = " + contractId, new Object[] { contractId });
        	  */
        	  Connection connection = jdbcTemplate.getDataSource().getConnection();

              PreparedStatement selectPreparedStatement = null;
        	  selectPreparedStatement = connection.prepareStatement("SELECT * FROM CONTRACTS WHERE contractId = " + contractId);
              ResultSet rs = selectPreparedStatement.executeQuery();
              System.out.println("H2 In-Memory Database selected through PreparedStatement");
              
              ret = new Contract();
              while (rs.next()) {
                  System.out.println("contractId " + rs.getLong("contractId") + "contractName " + rs.getString("contractName") );
                  ret.setContractId(rs.getLong("contractId"));
                  ret.setContractName(rs.getString("contractName"));
              }
              retContract = new ResponseEntity<>(ret, HttpStatus.OK);

              selectPreparedStatement.close();
   

        }
        catch ( SQLException sqle )
        {
        	    retContract = new ResponseEntity<>(ret, HttpStatus.NOT_FOUND);  // 404
        }
        catch (Exception e)
        {
        	    retContract = new ResponseEntity<>(ret, HttpStatus.NOT_FOUND);  // 404

        }
    	
        return retContract;
    }

}
