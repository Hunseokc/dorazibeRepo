module my.module.a {
    exports pack1;
    //exports pack2;
    requires transitive my.module.b;
}