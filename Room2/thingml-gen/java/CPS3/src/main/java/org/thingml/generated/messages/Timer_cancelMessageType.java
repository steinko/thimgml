/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.api.*;
import java.util.*;
import java.nio.*;

public class Timer_cancelMessageType extends EventType {
public Timer_cancelMessageType(short code) {super("timer_cancel", code);
}

public Timer_cancelMessageType() {
super("timer_cancel", (short) 0);
}

public Event instantiate() { return new Timer_cancelMessage(this); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate();
}

public class Timer_cancelMessage extends Event implements java.io.Serializable {

@Override
public String toString(){
return "timer_cancel (" + ")";
}

protected Timer_cancelMessage(EventType type) {
super(type);
}
@Override
public Event clone() {
return instantiate();
}}

}

