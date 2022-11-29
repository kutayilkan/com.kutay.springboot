package com.kutay.springboot.datePlanner.apiControllers;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.ErrorDataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.datePlanner.business.abstracts.ICountryService;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/api/datePlanner/countryService")
public class CountryRestService {

    @Autowired
    private ICountryService countryService;

    // Country

    @PostMapping(value = "/saveCountry")
    public ResponseEntity<?> saveCountry(@Valid @RequestBody Country country) {
        return ResponseEntity.ok(countryService.saveCountry(country));
    }

    @GetMapping(value = "/getAllCountry")
    public DataResult<List<Country>> getAllCountry() {
        return countryService.getAllCountry();
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleValidationRequestError(MethodArgumentNotValidException validationErrors){
        Map<String, String> validationErrorMaps = new HashMap<>();
        for (FieldError fieldError: validationErrors.getFieldErrors() ) {
            validationErrorMaps.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new ErrorDataResult<Object>(validationErrorMaps, "Validation/s errors");
    }

}