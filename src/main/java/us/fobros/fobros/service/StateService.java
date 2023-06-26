package us.fobros.fobros.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import us.fobros.fobros.entity.State;
import us.fobros.fobros.repo.StateRepository;

import java.util.List;

@Service

public class StateService {

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public void saveState(State state){
        stateRepository.save(state);
    }

    public Page<State> getState(String searchText, Integer page) {
        if (searchText==null || searchText.equals(""))
            return stateRepository.getAllStatesFromZip(
                    searchText,
                    PageRequest.of(page, 10, Sort.by("name").descending()));
        boolean digit = Character.isDigit(searchText.charAt(0));
        if (digit) {
            return stateRepository.getAllStatesFromZip(
                    searchText,
                    PageRequest.of(page, 10, Sort.by("name").descending()));

        }return stateRepository.getAllStatesFromCity(
                searchText,
                PageRequest.of(page, 10, Sort.by("name").descending()));



    }
}
