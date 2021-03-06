// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileStatRequest extends Table {
  public static FileStatRequest getRootAsFileStatRequest(ByteBuffer _bb) { return getRootAsFileStatRequest(_bb, new FileStatRequest()); }
  public static FileStatRequest getRootAsFileStatRequest(ByteBuffer _bb, FileStatRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FileStatRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createFileStatRequest(FlatBufferBuilder builder,
      int id) {
    builder.startObject(1);
    FileStatRequest.addId(builder, id);
    return FileStatRequest.endFileStatRequest(builder);
  }

  public static void startFileStatRequest(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static int endFileStatRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

