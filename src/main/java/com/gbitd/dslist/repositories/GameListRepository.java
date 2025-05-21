package com.gbitd.dslist.repositories;

import com.gbitd.dslist.entities.Game;
import com.gbitd.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
