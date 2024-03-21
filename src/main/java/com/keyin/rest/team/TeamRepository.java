package com.keyin.rest.team;

import com.keyin.rest.player.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository  extends CrudRepository<Team, Long> {
}
