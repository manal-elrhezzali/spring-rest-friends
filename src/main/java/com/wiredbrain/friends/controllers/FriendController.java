//package com.wiredbrain.friends.controllers;

import com.wiredbrain.friends.models.Friend;
import com.wiredbrain.friends.services.FriendService;
import com.wiredbrain.friends.util.ErrorMessage;
import com.wiredbrain.friends.util.FieldErrorMessage;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.validation.Valid;
import javax.xml.bind.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FriendController {
//
//  @Autowired
//  FriendService friendService;
//
//  @PostMapping("/friend")
//  public Friend create(@Valid @RequestBody Friend friend) {
//      return friendService.save(friend);
//  }
//
//  //this returns a text "friend cannot be created",
//  // but we want a JSON text error message
////  @ExceptionHandler(ValidationException.class)
////  ResponseEntity<String> exceptionHandler(ValidationException e) {
////    return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
////  }
//
//  @ResponseStatus(HttpStatus.BAD_REQUEST)
//  @ExceptionHandler(MethodArgumentNotValidException.class)
//  List<FieldErrorMessage> exceptionHandler(MethodArgumentNotValidException e) {
//    List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
//    List<FieldErrorMessage> fieldErrorMessages = fieldErrors.stream().map(
//            fieldError -> new FieldErrorMessage(fieldError.getField(), fieldError.getDefaultMessage()))
//        .collect(
//            Collectors.toList());
//    return fieldErrorMessages;
//  }
//
//  //returning a JSON text error message
//  @ResponseStatus(HttpStatus.BAD_REQUEST)
//  @ExceptionHandler(ValidationException.class)
//  ErrorMessage exceptionHandler(ValidationException e) {
//    return new ErrorMessage("400", e.getMessage());
//  }
//
//  @PutMapping("/friend")
//  public ResponseEntity<Friend> update(@RequestBody Friend friend) {
//    if(friendService.findById(friend.getId()).isPresent())
//      return new ResponseEntity(friendService.save(friend), HttpStatus.OK);
//    else
//      return new ResponseEntity(friend, HttpStatus.BAD_REQUEST);
//  }
//
//
//  @GetMapping("/friend")
//  public Iterable<Friend> read() {
//    return friendService.findAll();
//  }
//
//  @DeleteMapping("/friend/{id}")
//  public void delete(@PathVariable Integer id) {
//    friendService.deleteById(id);
//  }
//
//  @GetMapping("/friend/{id}")
//  public Optional<Friend> findById(@PathVariable Integer id) {
//    return friendService.findById(id);
//  }
//
////  @GetMapping("/friend/search")
////  Iterable<Friend> findByQuery(@RequestParam(value = "first", required = false) String firstName,
////      @RequestParam(value = "last", required = false) String lastName) {
////    if(firstName != null && lastName != null) {
////      return friendService.findByFirstNameAndLastName(firstName, lastName);
////    } else if(firstName != null) {
////      return friendService.findByFirstName(firstName);
////    } else if(lastName != null) {
////      return friendService.findByLastName(lastName);
////    } else {
////      return friendService.findAll();
////    }
////  }
//}
