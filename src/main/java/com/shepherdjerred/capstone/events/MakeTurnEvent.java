package com.shepherdjerred.capstone.events;

import com.shepherdjerred.capstone.logic.turn.Turn;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class MakeTurnEvent {

  private final Turn turn;
}
