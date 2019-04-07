/*
ユーザーに関するControllerのクラス.
 */
package architecture.interfaces.controllers;

import architecture.domain.dtos.UserCreateInputData;
import architecture.domain.dtos.UserCreateOutputData;
import architecture.usecases.UserCreateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserCreateUseCase useCase;

    @PostMapping(value = "/create")
    @ResponseStatus(org.springframework.http.HttpStatus.OK)
    @ResponseBody
    public UserCreateOutputData create(@RequestBody final UserCreateInputData inputData) throws Exception {
        // Controllerはここでユーザの入力からユースケースを実行します
        UserCreateOutputData outputData = useCase.create(inputData);
        return outputData;
    }
}
