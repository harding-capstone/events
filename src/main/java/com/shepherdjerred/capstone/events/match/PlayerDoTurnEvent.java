package com.shepherdjerred.capstone.events.match;

import com.shepherdjerred.capstone.logic.turn.Turn;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PlayerDoTurnEvent implements MatchEvent {

  private final Turn turn;
}
