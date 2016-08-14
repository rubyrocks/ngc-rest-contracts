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
public class ContractApiController implements ContractApi {

    public ResponseEntity<Void> deleteContract(
@ApiParam(value = "ID of contract to delete",required=true ) @PathVariable("contractId") Long contractId


) {
        // delete from contracts table using jdbcTemplate.execute SQL by contractId request value
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Contract> findContractById(
@ApiParam(value = "ID of contract to fetch",required=true ) @PathVariable("contractId") Long contractId


) {
        // Select from contracts table using jdbcTemplate.query SQL by contractId request value
        return new ResponseEntity<Contract>(HttpStatus.OK);
    }

}
