/*
 * Minesweeper API
 * REST API for Minesweeper
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PlayerMoveType
 */
@JsonAdapter(PlayerMoveType.Adapter.class)
public enum PlayerMoveType {
  REVEAL("reveal"),
  REDFLAG("redFlag"),
  QUESTIONMARK("questionMark"),
  CLEARFLAG("clearFlag");

  private String value;

  PlayerMoveType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayerMoveType fromValue(String text) {
    for (PlayerMoveType b : PlayerMoveType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayerMoveType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayerMoveType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayerMoveType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayerMoveType.fromValue(String.valueOf(value));
    }
  }
}
