package us.fobros.fobros.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import us.fobros.fobros.entity.State;
import us.fobros.fobros.service.StateService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/locations")
public class StateController {

    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }


    @GetMapping("/")
    public Page<State> getStates(@RequestParam String searchText, @RequestParam Integer page) {
       return stateService.getState(searchText,page);
    }
//private String save(Integer i ){
//    try {
//        String apiEndpoint = "https://back.usstartruckingllc.com/api/shipping/zip-codes/";
//        String searchTerm2 = i.toString();
//// Replace with your desired search term
//
//        // Construct the full URL with the search term
//        String url = apiEndpoint + "?page=" + searchTerm2;
//
//        // Construct the full URL with the search term
//
//        // Create an OkHttpClient instance
//        OkHttpClient client = new OkHttpClient();
//
//        // Create a Request
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//
//
//        // Send the request
//        Response response = client.newCall(request).execute();
//
//        // Get the response code and body
//        int responseCode = response.code();
//        String responseBody = response.body().string();
//
//        // Print the response
//        System.out.println("Response Code: " + responseCode);
//        System.out.println("Response Body: " + responseBody);
//
//// Parse the JSON response
//        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
//
//// Extract the 'results' array from the JSON
//        JsonArray resultsArray = jsonObject.getAsJsonArray("results");
//
//// Create a Gson instance to convert JSON to Java objects
//        Gson gson = new Gson();
//
//// Convert the 'results' array to an array of Result objects
//        State[] states = gson.fromJson(resultsArray, State[].class);
//
//// Access and use the 'results' array
//        for (State state : states) {
//            stateService.saveState(state);
//        }            // Close the response
//        response.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    return null;
//}

}




