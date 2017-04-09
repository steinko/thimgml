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

public class Set_polling_intervalMessageType extends EventType {
public Set_polling_intervalMessageType(short code) {super("set_polling_interval", code);
}

public Set_polling_intervalMessageType() {
super("set_polling_interval", (short) 0);
}

public Event instantiate(final short intrvl) { return new Set_polling_intervalMessage(this, intrvl); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate((Short) params.get("intrvl"));
}

public class Set_polling_intervalMessage extends Event implements java.io.Serializable {

public final short intrvl;
@Override
public String toString(){
return "set_polling_interval (" + "intrvl: " + intrvl + ")";
}

protected Set_polling_intervalMessage(EventType type, final short intrvl) {
super(type);
this.intrvl = intrvl;
}
@Override
public Event clone() {
return instantiate(this.intrvl);
}}

}

