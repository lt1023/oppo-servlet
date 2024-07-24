package com.demo.serverlet;

import com.heytap.cdo.card.domain.dto.ViewLayerWrapDto;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

import java.io.IOException;
import java.io.InputStream;

public class ProtoBufUtil {
    public ProtoBufUtil() {
    }

    public static <T> byte[] serializer(T o) {
        Schema schema = RuntimeSchema.getSchema(o.getClass());
        return ProtobufIOUtil.toByteArray(o, schema, LinkedBuffer.allocate(256));
    }

    public static <T> T deserializer(byte[] bytes, Class<T> clazz) {

        T obj = null;
        try {
            obj = clazz.newInstance();
            Schema schema = RuntimeSchema.getSchema(obj.getClass());
            ProtostuffIOUtil.mergeFrom(bytes, obj, schema);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
    public static ViewLayerWrapDto deserializer(InputStream bytes, Class clazz) {

        ViewLayerWrapDto obj = null;
        try {
            obj = new ViewLayerWrapDto();
            Schema schema = RuntimeSchema.getSchema(clazz);
            ProtostuffIOUtil.mergeFrom(bytes, obj, schema);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  obj;
    }
}
