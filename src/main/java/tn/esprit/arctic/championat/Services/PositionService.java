package tn.esprit.arctic.championat.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.Repository.PositionRepository;

@Service
@AllArgsConstructor
public class PositionService implements IPositionService {

    private PositionRepository positionRepository;



}