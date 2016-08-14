package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Contract;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-14T19:33:03.884Z")

@Controller
public class ContractsApiController implements ContractsApi {

    public ResponseEntity<Contract> addContract(

@ApiParam(value = "Contract object that needs to be added"  ) @RequestBody Contract body

) {
        Contract contract = new Contract();

        // Insert into contracts table using jdbcTemplate.execute SQL
        return new ResponseEntity<Contract>(HttpStatus.OK);
    }

    public ResponseEntity<List<Contract>> findContracts(@ApiParam(value = "tags to filter by") @RequestParam(value = "tags", required = false) List<String> tags



,
        @ApiParam(value = "maximum number of results to return") @RequestParam(value = "limit", required = false) Integer limit



) {
        // Select * from contracts table using jdbcTemplate.query SQL
        return new ResponseEntity<List<Contract>>(HttpStatus.OK);
    }

    public ResponseEntity<Contract> updateContract(

@ApiParam(value = "Contract object that needs to be updated"  ) @RequestBody Contract body

) {
        // Update contracts table using jdbcTemplate.execute SQL with Contract request body
        return new ResponseEntity<Contract>(HttpStatus.OK);
    }

}
