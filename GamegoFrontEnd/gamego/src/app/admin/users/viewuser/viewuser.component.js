"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.ViewuserComponent = void 0;
var core_1 = require("@angular/core");
var ViewuserComponent = /** @class */ (function () {
    function ViewuserComponent(httpClientService, router) {
        this.httpClientService = httpClientService;
        this.router = router;
        this.userDeletedEvent = new core_1.EventEmitter();
    }
    ViewuserComponent.prototype.ngOnInit = function () {
    };
    ViewuserComponent.prototype.deleteUser = function () {
        var _this = this;
        this.httpClientService.deleteUser(this.user.id).subscribe(function (user) {
            _this.userDeletedEvent.emit();
            _this.router.navigate(['admin', 'users']);
        });
    };
    __decorate([
        (0, core_1.Input)()
    ], ViewuserComponent.prototype, "user");
    __decorate([
        (0, core_1.Output)()
    ], ViewuserComponent.prototype, "userDeletedEvent");
    ViewuserComponent = __decorate([
        (0, core_1.Component)({
            selector: 'app-viewuser',
            templateUrl: './viewuser.component.html',
            styleUrls: ['./viewuser.component.css']
        })
    ], ViewuserComponent);
    return ViewuserComponent;
}());
exports.ViewuserComponent = ViewuserComponent;
