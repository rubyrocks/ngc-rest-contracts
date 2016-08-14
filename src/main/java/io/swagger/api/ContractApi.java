package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Contract;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-14T19:33:03.884Z")

@Api(value = "contract", description = "the contract API")
public interface ContractApi {

    @ApiOperation(value = "", notes = "deletes a single contract based on the ID supplied", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "contract deleted", response = Void.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Void.class) })
    @RequestMapping(value = "/contract/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteContract(
@ApiParam(value = "ID of contract to delete",required=true ) @PathVariable("contractId") Long contractId


);


    @ApiOperation(value = "", notes = "Returns a contract based on a single ID", response = Contract.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "contract response", response = Contract.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Contract.class) })
    @RequestMapping(value = "/contract/{id}",
        produces = { "application/json", "application/xml", "text/xml", "text/html" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Contract> findContractById(
@ApiParam(value = "ID of contract to fetch",required=true ) @PathVariable("contractId") Long contractId


);

}
