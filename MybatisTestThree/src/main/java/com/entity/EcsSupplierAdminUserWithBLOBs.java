package com.entity;

public class EcsSupplierAdminUserWithBLOBs extends EcsSupplierAdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    private String action_list;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    private String nav_list;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    private String todolist;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.action_list
     *
     * @return the value of ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    public String getAction_list() {
        return action_list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.action_list
     *
     * @param action_list the value for ecs_supplier_admin_user.action_list
     *
     * @mbg.generated
     */
    public void setAction_list(String action_list) {
        this.action_list = action_list == null ? null : action_list.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.nav_list
     *
     * @return the value of ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    public String getNav_list() {
        return nav_list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.nav_list
     *
     * @param nav_list the value for ecs_supplier_admin_user.nav_list
     *
     * @mbg.generated
     */
    public void setNav_list(String nav_list) {
        this.nav_list = nav_list == null ? null : nav_list.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_admin_user.todolist
     *
     * @return the value of ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    public String getTodolist() {
        return todolist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_admin_user.todolist
     *
     * @param todolist the value for ecs_supplier_admin_user.todolist
     *
     * @mbg.generated
     */
    public void setTodolist(String todolist) {
        this.todolist = todolist == null ? null : todolist.trim();
    }
}