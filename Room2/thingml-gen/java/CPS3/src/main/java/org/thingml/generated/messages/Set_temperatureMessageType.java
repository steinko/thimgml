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

public class Set_temperatureMessageType extends EventType {
public Set_temperatureMessageType(short code) {super("set_temperature", code);
}

public Set_temperatureMessageType() {
super("set_temperature", (short) 0);
}

public Event instantiate(final float t) { return new Set_temperatureMessage(this, t); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate((Float) params.get("t"));
}

public class Set_temperatureMessage extends Event implements java.io.Serializable {

public final float t;
@Override
public String toString(){
return "set_temperature (" + "t: " + t + ")";
}

protected Set_temperatureMessage(EventType type, final float t) {
super(type);
this.t = t;
}
@Override
public Event clone() {
return instantiate(this.t);
}}

}

