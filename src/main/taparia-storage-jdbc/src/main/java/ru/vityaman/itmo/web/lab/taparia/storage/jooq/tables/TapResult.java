/*
 * This file is generated by jOOQ.
 */
package ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.vityaman.itmo.web.lab.taparia.storage.jooq.Keys;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.Taparia;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.enums.TapResultStatus;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.records.TapResultRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TapResult extends TableImpl<TapResultRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>taparia.tap_result</code>
     */
    public static final TapResult TAP_RESULT = new TapResult();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TapResultRecord> getRecordType() {
        return TapResultRecord.class;
    }

    /**
     * The column <code>taparia.tap_result.id</code>.
     */
    public final TableField<TapResultRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("nextval('taparia.seq_tap_result_id'::regclass)", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>taparia.tap_result.owner_id</code>.
     */
    public final TableField<TapResultRecord, Long> OWNER_ID = createField(DSL.name("owner_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>taparia.tap_result.picture_id</code>.
     */
    public final TableField<TapResultRecord, Long> PICTURE_ID = createField(DSL.name("picture_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>taparia.tap_result.x</code>.
     */
    public final TableField<TapResultRecord, Long> X = createField(DSL.name("x"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>taparia.tap_result.y</code>.
     */
    public final TableField<TapResultRecord, Long> Y = createField(DSL.name("y"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>taparia.tap_result.status</code>.
     */
    public final TableField<TapResultRecord, TapResultStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(ru.vityaman.itmo.web.lab.taparia.storage.jooq.enums.TapResultStatus.class), this, "");

    private TapResult(Name alias, Table<TapResultRecord> aliased) {
        this(alias, aliased, null);
    }

    private TapResult(Name alias, Table<TapResultRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>taparia.tap_result</code> table reference
     */
    public TapResult(String alias) {
        this(DSL.name(alias), TAP_RESULT);
    }

    /**
     * Create an aliased <code>taparia.tap_result</code> table reference
     */
    public TapResult(Name alias) {
        this(alias, TAP_RESULT);
    }

    /**
     * Create a <code>taparia.tap_result</code> table reference
     */
    public TapResult() {
        this(DSL.name("tap_result"), null);
    }

    public <O extends Record> TapResult(Table<O> child, ForeignKey<O, TapResultRecord> key) {
        super(child, key, TAP_RESULT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Taparia.TAPARIA;
    }

    @Override
    public UniqueKey<TapResultRecord> getPrimaryKey() {
        return Keys.TAP_RESULT_PKEY;
    }

    @Override
    public List<ForeignKey<TapResultRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TAP_RESULT__FK_USER_ACCOUNT, Keys.TAP_RESULT__FK_PICTURE);
    }

    private transient UserAccount _userAccount;
    private transient Picture _picture;

    /**
     * Get the implicit join path to the <code>taparia.user_account</code>
     * table.
     */
    public UserAccount userAccount() {
        if (_userAccount == null)
            _userAccount = new UserAccount(this, Keys.TAP_RESULT__FK_USER_ACCOUNT);

        return _userAccount;
    }

    /**
     * Get the implicit join path to the <code>taparia.picture</code> table.
     */
    public Picture picture() {
        if (_picture == null)
            _picture = new Picture(this, Keys.TAP_RESULT__FK_PICTURE);

        return _picture;
    }

    @Override
    public TapResult as(String alias) {
        return new TapResult(DSL.name(alias), this);
    }

    @Override
    public TapResult as(Name alias) {
        return new TapResult(alias, this);
    }

    @Override
    public TapResult as(Table<?> alias) {
        return new TapResult(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TapResult rename(String name) {
        return new TapResult(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TapResult rename(Name name) {
        return new TapResult(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TapResult rename(Table<?> name) {
        return new TapResult(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, Long, TapResultStatus> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super TapResultStatus, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super TapResultStatus, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}