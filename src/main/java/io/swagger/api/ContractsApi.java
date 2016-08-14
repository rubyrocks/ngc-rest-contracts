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

@Api(value = "contracts", description = "the contracts API")
public interface ContractsApi {

    @ApiOperation(value = "", notes = "Creates a new contract", response = Contract.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "contract response", response = Contract.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Contract.class) })
    @RequestMapping(value = "/contracts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Contract> addContract(

@ApiParam(value = "Contract object that needs to be added"  ) @RequestBody Contract body

);


    @ApiOperation(value = "", notes = "Returns all contracts", response = Contract.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "contract response", response = Contract.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Contract.class) })
    @RequestMapping(value = "/contracts",
        produces = { "application/json", "application/xml", "text/xml", "text/html" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Contract>> findContracts(@ApiParam(value = "tags to filter by") @RequestParam(value = "tags", required = false) List<String> tags



,@ApiParam(value = "maximum number of results to return") @RequestParam(value = "limit", required = false) Integer limit



);


    @ApiOperation(value = "", notes = "Updates a contract", response = Contract.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "contract response", response = Contract.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Contract.class) })
    @RequestMapping(value = "/contracts",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Contract> updateContract(

@ApiParam(value = "Contract object that needs to be updated"  ) @RequestBody Contract body

);

}
