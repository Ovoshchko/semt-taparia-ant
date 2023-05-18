/*
 * This file is generated by jOOQ.
 */
package ru.vityaman.itmo.web.lab.taparia.storage.jooq;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in taparia.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>taparia.seq_picture_id</code>
     */
    public static final Sequence<Long> SEQ_PICTURE_ID = Internal.createSequence("seq_picture_id", Taparia.TAPARIA, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>taparia.seq_tap_result_id</code>
     */
    public static final Sequence<Long> SEQ_TAP_RESULT_ID = Internal.createSequence("seq_tap_result_id", Taparia.TAPARIA, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>taparia.seq_user_account_id</code>
     */
    public static final Sequence<Long> SEQ_USER_ACCOUNT_ID = Internal.createSequence("seq_user_account_id", Taparia.TAPARIA, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}