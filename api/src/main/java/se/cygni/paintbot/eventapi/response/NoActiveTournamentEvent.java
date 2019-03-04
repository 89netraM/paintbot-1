package se.cygni.paintbot.eventapi.response;


import com.fasterxml.jackson.annotation.JsonCreator;
import se.cygni.paintbot.eventapi.ApiMessage;
import se.cygni.paintbot.eventapi.type.ApiMessageType;

@ApiMessageType
public class NoActiveTournamentEvent extends ApiMessage {

    @JsonCreator
    public NoActiveTournamentEvent(){}
}
